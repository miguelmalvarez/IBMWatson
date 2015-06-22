# IBMWatson

Repository to play with the IBMWatson APIs. This includes their entity and relationship extraction, sentiment analysis, concept classification and taxonomy tagging.

To run please do the following:

1) Put your IBM Watson API key in resources/config.edn following the same format shown in resources/config_sample.edn 

2) lein exec -p src/ibmwatson/run.clj

In order to do this you will need to have:

* lein exec installed (https://clojars.org/lein-exec)
* IBM Watson / AlchemyAPI API key (http://www.alchemyapi.com/api/register.html)