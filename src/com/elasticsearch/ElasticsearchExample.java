package com.elasticsearch;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.nio.entity.NStringEntity;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;

public class ElasticsearchExample {
	
	private RestClient restClient;
	
	public RestClient getRestClient() {
		return restClient;
	}

	public ElasticsearchExample() {
		final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
		credentialsProvider.setCredentials(AuthScope.ANY,
				new UsernamePasswordCredentials("elastic", "PASSWORD_ELASTIC_USER"));

		RestClientBuilder builder = RestClient
				.builder(new HttpHost("CLUSTER_URL", 9243, "https"))
				.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
					public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
						return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
					}
				});

		restClient = builder.build();
	}
	
	public Response indexDocument(String index, String type, String id, String json) throws IOException {
		Map<String, String> params = Collections.emptyMap();
		HttpEntity entity = new NStringEntity(json, ContentType.APPLICATION_JSON);
		
		//Response response = getRestClient().performRequest
			//	("POST", String.format("/%s/%s/%s", index, type, id), params, entity);
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		ElasticsearchExample example = new ElasticsearchExample();
		String json = "{" + "\"user\":\"kimchy\"," + "\"postDate\":\"2013-01-30\","
				+ "\"message\":\"trying out Elasticsearch\"" + "}";
		try {
			Response response = example.indexDocument("posts", "doc", "1", json);
			System.out.println(response.toString());
			example.getRestClient().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

