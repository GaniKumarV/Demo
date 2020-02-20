package com.elasticsearch;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;

public class SimpleOperationsElasticsearchRestClient {

	private RestClient client;

	public RestClient getClient() {
		return client;
	}

	public SimpleOperationsElasticsearchRestClient() {
		client = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();
	}

	public Response indexDocument(String index, String type, String id, String json) throws IOException {
		Map<String, String> params = Collections.emptyMap();
		HttpEntity entity = new NStringEntity(json, ContentType.APPLICATION_JSON);

		Request request = new Request("Post", "/posts/doc/1");

		request.addParameter("params", params.toString());
		request.addParameter("entity", entity.toString());

		// Response response = restClient.performRequest(request);

		Response response = getClient().performRequest(request);
		return response;
	}

	public static void main(String[] args) {
		SimpleOperationsElasticsearchRestClient example = new SimpleOperationsElasticsearchRestClient();

		String json = "{" + "\"user\":\"kimchy\"," + "\"postDate\":\"2013-01-30\","
				+ "\"message\":\"trying out Elasticsearch\"" + "}";
		try {
			Response response = example.indexDocument("posts", "doc", "1", json);
			System.out.println(response.toString());
			example.getClient().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
