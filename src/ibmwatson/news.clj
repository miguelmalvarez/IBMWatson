(ns ibmwatson.news
	(:require [clj-http.client :as client]))  	

;; TODO: Config file
(def root_url "https://access.alchemyapi.com/calls/data/GetNews")

(defn sample 
	[api_key]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "return" "original,enriched.url.title"}}))

;; TODO: Default values
(defn positives
	[text min-prob api_key]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "q.enriched.url.title" text
										 "q.enriched.url.enrichedTitle.docSentiment" (str "|type=positive,score=>" min-prob "|")
										 "return" "original,enriched.url.title"}}))


;; TODO: Default values
(defn negatives	
	[text min-prob api_key]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "q.enriched.url.title" text
										 "q.enriched.url.enrichedTitle.docSentiment" (str "|type=negative,score=>" min-prob "|")
										 "return" "original,enriched.url.title"}}))