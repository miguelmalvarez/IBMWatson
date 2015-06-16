(ns ibmwatson.text
	(:require [clj-http.client :as client]))  	

;; TODO: Refactor


(defn entities
	[text api_key]
	(let [root_url "http://access.alchemyapi.com/calls/text/TextGetRankedNamedEntities"]
		(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"
										 "disambiguated" 1}})))

(defn sentiment
	[text api_key]
	(let [root_url "http://access.alchemyapi.com/calls/text/TextGetTextSentiment"]
		(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"}})))

(defn entity-level-sentiment
	[text api_key]
	(let [root_url "http://access.alchemyapi.com/calls/text/TextGetRankedNamedEntities"]
		(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"
										 "disambiguated" 1
										 "sentiment" 1}})))

(defn relations
	[text api_key]
	(let [root_url "http://access.alchemyapi.com/calls/text/TextGetRelations"]
		(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"}})))

(defn taxonomy
	[text api_key]
	(let [root_url "http://access.alchemyapi.com/calls/text/TextGetRankedTaxonomy"]
		(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"}})))

(defn concepts
	[text api_key]
	(let [root_url "http://access.alchemyapi.com/calls/text/TextGetRankedConcepts"]
		(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"}})))