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

# Modeling with SQL

**Sualeh Fatehi**


## Modeling in SQL
![bg right opacity:.4](../common/calendar.jpg "Calendar")


## SQL Data Types
| Standard SQL Type | Usage |
|----------------------------|----------------------------------|
| `DATE` | Local date |
| `TIME` | Local time |
| `TIME WITH TIME ZONE` | Time with timezone |
| `TIMESTAMP` | Local date and time |
| `TIMESTAMP WITH TIME ZONE` | Date and time with timezone |


## Modeling instants
- `TIMESTAMP WITH TIME ZONE` is the only type that can accurately model machine time
- Called 
  - `TIMESTAMPTZ` in PostgreSQL
  - `DATETIMEOFFSET` in Microsoft SQL Server


## Slides and Code

[github.com/**sualeh/make-a-date**](https://github.com/sualeh/make-a-date)
![width:300](../common/qr-code.png "GitHub project")
