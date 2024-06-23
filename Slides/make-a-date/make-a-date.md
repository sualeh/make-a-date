---
marp: true
draft: true
theme: uncover
headingDivider: 2
paginate: true
style: |
  section {
    text-align: left;
  }
  ul, ol, li {
    margin-left: 0;
  }
  h2 {
    font-size: 1.5rem;
    color: #0000DD;
  }
  pre {
    font-size: 1.0rem;
  }
_class:
 - lead
 - invert
---

# Make a Date

**Sualeh Fatehi**


## Concepts
![bg right opacity:.4](../common/calendar.jpg "Calendar")

Let us start with some concepts


## Epoch
- Reference point to measure time
- May be based on religious or political milestones
- Divides the timeline into eras
- Start of a particular era


## Computer System Epochs
- January 0, 0 - MATLAB
- January 1, 1 - .NET
- January 1, 1601 - COBOL, Windows
- January 1, 1900 - LISP, SNTP for time
- January 1, 1970 - Unix Epoch
  Linux, Mac OS X, Java, C, JavaScript, PHP, Python, Ruby


## Machine View of Time
Machines have *one* view of time:
- Discrete points corresponding to the smallest measurement possible
- A single, ever increasing number


## Instant
- Point on a discretized timeline
- .NET measures "ticks" of 100 nanoseconds in `DateTimeOffset`
- Java `Instant` has nanosecond precision
- Use for event time-stamps


## Human View of Time
Humans have a *different* view of time:
- Continuous timelines
- Calendar systems
- Arbitrary units like years, months, days, hours
- timezones, and daylight savings rules


## Calendar System
- Organizes days for social, religious, commercial or administrative purposes
- Names periods like days, weeks, months, and years
- Periods may follow cycles of the sun or moon
- A date is a specific day in the system
- May be based on an epoch


## UTC
- UTC is Coordinated Universal Time
- Precisely defined with atomic time
- Does not change with seasons
- Replaced GMT as reference time scale in 1972
- UTC is sometimes denoted by Z (Zulu)


## timezone
- Region with uniform standard time for legal, commercial, social, and political purposes
- Some countries observe daylight saving time
- Offset from UTC (UTC-12 to UTC+14)


## Quiz - Question
![bg right opacity:.4](./quiz.jpg "Quiz")

How many timezones are in the USA?


## Quiz - Answer
timezones in the USA
- Eastern timezone (ET)
- Central timezone (CT)
- Mountain timezone (MT)
- Pacific timezone (PT)
- Alaska timezone (AKT)
- Hawaii-Aleutian timezone (HAT)
- Samoa timezone (ST)
- Chamorro timezone (ChT)


## Crazy timezones
![width:900](./az-time-zones.png "Arizona timezones")


## Local Date and Time
- Local date and time is missing timezone data
- Timezone may be implied: "Meet me at 6 pm"


## Local Date and Time Examples
- A birthday, holiday, or employee hire date is a local date
- An daily alarm is a local time
- An meeting time or movie show time is a local date with time


## ISO 8601
- International standard for representation of dates and times
- Uses the Gregorian calendar system
- Ordered from most to least significant: year, month, day, hour, minute
- Each date and time value has a fixed number of digits with leading zeros
- Uses four-digit year at minimum, YYYY


## ISO 8601 on xkcd
![iso_8601.png](https://imgs.xkcd.com/comics/iso_8601.png)


## Common Sources of Error
- Converting a local date and time into date and time (with timezone offset)
- Storing date and time (with timezone offset) into local date and time
- Using SQL `TIMESTAMP` to store events (without timezone information)
- Not handling daylight savings time boundaries - 23 or 25 hours in a day


## Slides and Code

[github.com/**sualeh/make-a-date**](https://github.com/sualeh/make-a-date)
![width:300](../common/qr-code.png "GitHub project")
