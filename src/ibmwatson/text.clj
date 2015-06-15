(ns ibmwatson.text
	(:require [clj-http.client :as client]))  	

(def api_key YOUR_API)
(def root_url "http://access.alchemyapi.com/calls/text/TextGetRankedNamedEntities")

(defn annotate
	[text]
	(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"
										 "disambiguated" 1}}))

