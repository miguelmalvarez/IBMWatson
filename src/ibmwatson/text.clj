(ns ibmwatson.text
	(:require [clj-http.client :as client]))  	

;; TODO: Config file
(def root_url "http://access.alchemyapi.com/calls/text/TextGetRankedNamedEntities")

(defn annotate
	[text api_key]
	(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"
										 "disambiguated" 1}}))

