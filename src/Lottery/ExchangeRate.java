/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

// necessary components are imported
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author samoy
 */
public class ExchangeRate {
    
    //Se asignan los valores necesarios para acceder al API.
    public static final String ACCESS_KEY = "f8647da0bebf7b9dd8ecab46dd86f8b3";
    public static final String BASE_URL = "https://apilayer.net/api/";
    public static final String ENDPOINT = "convert";

    //Este objeto es utilizado para slicitar al API el REST.
    static CloseableHttpClient httpClient = HttpClients.createDefault();

    //Método para enviar la solicitud al usuario del API.
    public static void sendConvertRequest() {

        // the "from", "to" and "amount" can be set as variables
        HttpGet get = new HttpGet(BASE_URL + ENDPOINT + "?access_key=" + ACCESS_KEY + "&from=GBP&to=INR&amount=2");
        try {
            CloseableHttpResponse response = httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            JSONObject jsonObject = new JSONObject(EntityUtils.toString(entity));

            System.out.println("Single-Currency Conversion");

            // access the parsed JSON objects
            System.out.println("From : " + jsonObject.getJSONObject("query").getString("from"));
            System.out.println("To : " + jsonObject.getJSONObject("query").getString("to"));
            System.out.println("Amount : " + jsonObject.getJSONObject("query").getLong("amount"));
            System.out.println("Conversion Result : " + jsonObject.getDouble("result"));
            System.out.println("\n");
            response.close();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        sendConvertRequest();
        httpClient.close();
    }
}

