Diagrama de Classes (Domínio da API)

``` mermaid

classDiagram
    class User {
        -String nome
        -Account account
        -List<Feature> features
        -Card card
        -List<News> news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" --> "1" Account : has
    User "1" --> "*" Feature : has
    User "1" --> "1" Card : has
    User "1" --> "*" News : has
```