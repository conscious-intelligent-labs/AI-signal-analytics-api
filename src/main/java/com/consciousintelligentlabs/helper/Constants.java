package com.consciousintelligentlabs.helper;

import java.util.concurrent.CountDownLatch;

public class Constants {

  public static final CountDownLatch CONFIRM_COUNTDOWN_LATCH = new CountDownLatch(1);
  public static final CountDownLatch RETURN_COUNTDOWN_LATCH = new CountDownLatch(1);
  public static final String NOTIFICATION_EVENT = "[NOTIFICATION]";
  public static final String SAAPI_EVENT = "[SAAPI]";
  public static final String RABBITMQ_EVENT = "[RabbitMQ]";
  public static final String SUPPORT_AND_RESISTANCE_EVENT = "[SupportAndResistance]";
  public static final String TECHNICAL_INDICATOR_EVENT = "[TechnicalIndicator]";
  public static final String NEWS_EVENT = "[News]";
  public static final String[] CHART_TIMEFRAMES = {
    "1", "5", "15", "30", "60", "240", "D", "W", "M"
  };
  public static final String[] NEWS_CATAGORY = {"general", "forex", "crypto", "merger"};
}