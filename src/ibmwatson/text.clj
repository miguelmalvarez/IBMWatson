(ns ibmwatson.text
	(:require [clj-http.client :as client]))  	

(defn- text-call
	[text endpoint params]
	(let [root_url (str "http://access.alchemyapi.com/calls/text/" endpoint)]
		(client/get root_url {:query-params params})))

(defn entities
	[text api_key]
	(let [params {"apikey" api_key
				  "text" text
				  "outputMode" "json"
				  "disambiguated" 1}]
	(text-call text "TextGetRankedNamedEntities" params)))

(defn sentiment
	[text api_key]
	(let [params {"apikey" api_key
				  "text" text
				  "outputMode" "json"
				  "disambiguated" 1}]
	(text-call text "TextGetTextSentiment" params)))

(defn entity-level-sentiment
	[text api_key]
	(let [params {"apikey" api_key
				  "text" text
				  "outputMode" "json"
				  "disambiguated" 1
                                  "sentiment" 1}]
	(text-call text "TextGetRankedNamedEntities" params)))

(defn relations
	[text api_key]
	(let [params {"apikey" api_key
				  "text" text
				  "outputMode" "json"
				  "disambiguated" 1}]
	(text-call text "TextGetRelations" params)))

(defn taxonomy
	[text api_key]
	(let [params {"apikey" api_key
				  "text" text
				  "outputMode" "json"
				  "disambiguated" 1}]
	(text-call text "TextGetRankedTaxonomy" params)))

(defn concepts
	[text api_key]
	(let [params {"apikey" api_key
				  "text" text
				  "outputMode" "json"
				  "disambiguated" 1}]
	(text-call text "TextGetRankedConcepts" params)))
