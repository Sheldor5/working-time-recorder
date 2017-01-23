package at.sheldor5.tr.core.rules;


import at.sheldor5.tr.core.objects.Record;
import at.sheldor5.tr.core.objects.Session;
import at.sheldor5.tr.core.records.RecordType;
import at.sheldor5.tr.core.utils.TimeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 23.01.2017.
 */
public class RuleTest {

  private static final List<String> workingDays = new ArrayList<>();
  private static final List<String> sunday = new ArrayList<>();

  @org.junit.Before
  public void init() {
    workingDays.add("monday");
    workingDays.add("tuesday");
    workingDays.add("wednesday");
    workingDays.add("thursday");
    workingDays.add("friday");
    workingDays.add("saturday");
    sunday.add("sunday");
  }

  @Test
  public void test_rule() {
    /*final Rule rule = new Rule();
    rule.name = "Test Rule";
    rule.keyDate = LocalDate.of(1900, 01, 01);
    final Before before = new Before(LocalTime.of(4, 0), 1.5D, workingDays);
    final After after = new After(Time.valueOf("22:00:00"), 1.5D, workingDays);
    rule.timeOperations.add(before);
    rule.timeOperations.add(after);

    final Date date = new Date(System.currentTimeMillis());
    final Time beginTime = TimeUtils.getTime(4, 0, 0, 0);
    final Time endTime = TimeUtils.getTime(23, 0, 0, 0);
    final Record begin = new Record(0, date, beginTime, RecordType.CHECKIN);
    final Record end = new Record(0, date, endTime, RecordType.CHECKOUT);

    final Session session = new Session(1.0D, begin, end);
    Assert.assertTrue("Rule failed to apply", rule.applies(session));*/
  }
}