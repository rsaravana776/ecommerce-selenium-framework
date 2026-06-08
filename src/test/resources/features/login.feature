
@smoke

Feature: Login

Scenario: User login

  Given Open Website

  When User enters credentials

    | email          | password |
    | test27@gmail.com | 123456   |

  Then Login should happen

