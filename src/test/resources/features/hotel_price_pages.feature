Feature: As Carolina as sales manager at the travel agency
  I need to see the lowest price of the hotels according to the destination
  To verify the rates charged to customers

  Scenario Outline: Verify the rates charged to customers in New York
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel pages with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | New York | 12/13/2020 | 12/14/2020 | 2     | 1    | 1        | 238.00 |