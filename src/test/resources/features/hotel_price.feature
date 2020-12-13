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
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | New York | 12/13/2020 | 12/14/2020 | 2     | 1    | 1        | 238.00 |

  Scenario Outline: Verify the rates charged to customers in Los Angeles
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location    | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Los Angeles | 12/13/2020 | 12/14/2020 | 2     | 1    | 1        | 218.00 |

  Scenario Outline: Verify the rates charged to customers in San Francisco
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location      | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | San Francisco | 12/13/2020 | 12/14/2020 | 2     | 2    | 1        | 598.00 |

  Scenario Outline: Verify the rates charged to customers in Las Vegas
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location  | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Las Vegas | 12/13/2020 | 12/14/2020 | 2     | 1    | 1        | 210.00 |

  Scenario Outline: Verify the rates charged to customers in Honolulu
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Honolulu | 12/13/2020 | 12/14/2020 | 2     | 1    | 2        | 222.00 |

  Scenario Outline: Verify the rates charged to customers in Nassau
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Nassau   | 12/13/2020 | 12/14/2020 | 2     | 1    | 2        | 498.00 |

  Scenario Outline: Verify the rates charged to customers in Paris
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Paris    | 12/13/2020 | 12/14/2020 | 1     | 1    | 2        | 220.00 |

  Scenario Outline: Verify the rates charged to customers in London
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | London   | 12/13/2020 | 12/14/2020 | 2     | 1    | 2        | 298.00 |

  Scenario Outline: Verify the rates charged to customers in rome
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Rome     | 12/13/2020 | 12/14/2020 | 2     | 2    | 2        | 498.00 |

  Scenario Outline: Verify the rates charged to customers in Hamburg
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
    When Enter the hotel with the lowest price
    Then Will visualize that the <price> to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | price  |
      | Carolina  | Hamburg  | 12/13/2020 | 12/14/2020 | 2     | 4    | 2        | 398.00 |

