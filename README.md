# AUTHOR-BOOKS-EVENT-DRIVEN

## DESCRIPTION

Moc book's event driven microservice app. Creates new publish event's with book's in Kafka, and then store's data in domain objects. 
Have a separate notification service, to notify user's that new book is appeared.

The project includes next artifact's:
- `book-publisher` - simple moc backend that publishes book events to Apache Kafka topic
- `book-persistence` - microservice that owns domain `BOOK` and stores all books in Relational Database
- `book-publisher` - microservice that owns domain `PUBLISHER` and stores all publishers in Relational Database
- `notifications` - microservice that takes notifications from Apache Kafka and produces it through REST API

## HOW TO USE

You should have installed instance of docker-compose on your machine. To start the application simply
run the following command in your preferred command-line tool in the root folder of project:

```
docker-compose up
```