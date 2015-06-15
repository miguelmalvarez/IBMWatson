(ns ibmwatson.news
	(:require [clj-http.client :as client]))  	

(def api_key "c660d29868a62f95066894851a65e8f2cbcf8256")
(def root_url "https://access.alchemyapi.com/calls/data/GetNews")


(defn sample 
	[]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "return" "original"}}))

;; TODO: Default values
(defn positives
	[text min-prob]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "q.enriched.url.title" text
										 "q.enriched.url.enrichedTitle.docSentiment" (str "|type=positive,score=>" min-prob "|")
										 "return" "original"}}))


;; TODO: Default values
(defn negatives	
	[text min-prob]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "q.enriched.url.title" text
										 "q.enriched.url.enrichedTitle.docSentiment" (str "|type=negative,score=>" min-prob "|")
										 "return" "original"}}))

(print (positives "Greece" 0.9))

(print (negatives "Greece" 0.9))