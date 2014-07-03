package org.digidoc4j.utils;

import java.util.Date;

public class DateUtils {
  /**
   * Checks is date in range of twenty seconds
   *
   * @param date to compare
   */
  public static boolean isAlmostNow(Date date) {
    return isInRangeOneMinute(new Date(), date);
  }

  private static boolean isInRangeOneMinute(Date date1, Date date2) {
    Date latestTime = org.apache.commons.lang.time.DateUtils.addSeconds(date2, 60);
    Date earliestTime = org.apache.commons.lang.time.DateUtils.addSeconds(date2, -60);
    return date1.before(latestTime) && date1.after(earliestTime);
  }
}