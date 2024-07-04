package ru.gb.Lesson2_basics.sql;

import java.sql.Connection;

// hibernate
public class MySessionFactory {

  private final Connection connection;

  public MySessionFactory(Connection connection) {
    this.connection = connection;
  }

}
