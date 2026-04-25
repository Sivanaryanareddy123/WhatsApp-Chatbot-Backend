## WhatsApp Chatbot Backend (Spring Boot)

## Overview

This project is a simple WhatsApp chatbot backend simulation built using Spring Boot.
It exposes a REST API endpoint to receive messages and return predefined responses.

##  Features

* REST API endpoint: `/webhook`
* Accepts JSON input
* Responds to messages:

  * Hi → Hello
  * Bye → Goodbye
  * Others → I don't understand
* Logs all incoming messages

##  Tech Stack

* Java 17
* Spring Boot
* REST API

##  API Details

### Endpoint:

POST `/webhook`

### Request:

```json
{
  "message": "Hi"
}
```

### Response:

```
Hello
```

##  Testing

Tested using Postman.

##  Run Project

* Using Spring Tool Suite
* Right-click project → Run As → Spring Boot App

##  Output

* API returns correct responses
* Console logs incoming messages

##  Author

B.Siva Narayana Reddy
