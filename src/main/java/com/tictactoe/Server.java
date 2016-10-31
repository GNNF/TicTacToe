package com.tictactoe;

import static spark.Spark.*;
import java.lang.*;

public class Server {

  Server() {

  }

  public static void main(String[] args) {
    WebTicTacToe game =  new WebTicTacToe();

    port(getHerokuAssignedPort());
    staticFiles.location("/public");
    staticFiles.expireTime(1);

    get("/", (request, response) -> {
      response.status(200);
      return response;
    });

    post("/render", (request, response) -> {
      return game.renderGame();
    });

    post("/new", (request, response) -> {
      game.clear();
      return game.renderGame();
    });

    post("/play/:index", (request, response) -> {
      if (!game.isOver()) {
        if (isInteger(request.params(":index"))) {
          int play = Integer.parseInt(request.params(":index"));
          if (game.makePlay(play)) {
            game.computerMakePlay();
          }
        } else {
          //Add some error
        }
      }
      
      return game.renderGame();
    });
  } 

  private static int getHerokuAssignedPort() {
    ProcessBuilder processBuilder = new ProcessBuilder();
    if (processBuilder.environment().get("PORT") != null) {
        return Integer.parseInt(processBuilder.environment().get("PORT"));
    }
    return 5050; //return default port if heroku-port isn't set (i.e. on localhost)
  }

  private static boolean isInteger(String string) {
    try {
        Integer.parseInt(string);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
  }

} 