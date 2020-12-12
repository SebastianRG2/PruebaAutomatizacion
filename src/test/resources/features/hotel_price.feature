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
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | New York | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in Los Angeles
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location    | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Los Angeles | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in San Francisco
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location      | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | San Francisco | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in Las Vegas
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location  | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Las vegas | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in Honolulu
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Honolulu | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in Nassau
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Nassau   | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in Paris
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Paris    | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in London
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | London   | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in rome
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Rome     | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

  Scenario Outline: Verify the rates charged to customers in Hamburg
    Given What <nameActor> enters the hotel data to search
      | location | <location> |
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
      | adult    | <adult>    |
      | room     | <room>     |
      | children | <children> |
      | rate     | <rate>     |
    When Enter the hotel with the lowest price
    Then Will visualize that the price to be charged to the client is the agreed
    Examples:
      | nameActor | location | checkIn    | checkOut   | adult | room | children | rate    |
      | Carolina  | Hamburg  | 12/12/2020 | 12/13/2020 | 2     | 1    | 1        | $598.00 |

