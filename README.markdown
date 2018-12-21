# Liberator Examples

Liberator is a Clojure library for building RESTful applications.

## Quick Links

You can find documentation at http://clojure-liberator.github.io/liberator

If you have any questions, visit our fine google group at https://groups.google.com/forum/#!forum/clojure-liberator

### Dependencies

The examples in this document rely on you installing [leiningen 2](http://leiningen.org).

### Running the examples

If you want to see the examples in a browser, run

    lein examples

This will start a web server on port 8000 (but you can specify a alternative port with an argument, eg. ```lein examples 8001```). Alternatively you can run the web server with ```lein ring server```).

### Ensuring the tests pass

Liberator uses [Midje](https://github.com/marick/Midje/) for testing. You can run all the tests like this :-

    lein midje

# Documentation

Documentation and a tutorial can be found on [http://clojure-liberator.github.io](http://clojure-liberator.github.io).

# License

Liberator is licensed under EPL 1.0 (see file epl-v10.html).
