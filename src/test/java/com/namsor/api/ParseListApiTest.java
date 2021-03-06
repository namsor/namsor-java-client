/*
 * Namsor
 * <h2>NamSor SDK infers Gender and Origin from international names</h2>  <p>NamSor specialized data mining software recognizes the <strong>gender</strong>, the <strong>linguistic or cultural origin of personal names</strong> in any alphabet / language, with fine grain and high accuracy.</p>  <p>Visit <a href=\"http://namsor.com\">NamSor.com</a> to learn more.</p> 
 *
 * OpenAPI spec version: 1.1.0
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.namsor.api;

import com.namsor.ApiException;
import com.namsor.model.FullNameListInput;
import com.namsor.model.ParsedNameListOutput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParseListApi
 */
@Ignore
public class ParseListApiTest {

    private final ParseListApi api = new ParseListApi();

    
    /**
     * Parse many names (up to 1000)
     *
     * Parse a list of names into firstName, lastName components, specifying how they should be parsed.    nameFormatTip:ORDER_FNLN means that the order has to be firstName, lastName (the API will only choose where to split the name). Possible values:  ORDER_FNLN, // firstName first  ORDER_LNFN, // lastName first  ORDER_FNLN_OR_LNFN, // make best guess, individually name by name  ORDER_FNLN_OR_LNFN_ALLSAME // make best guess and apply to ALL the names (if most names are FNLN, then ALL names will be considered FNLN)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseListTest() throws ApiException {
        String xChannelSecret = null;
        String xChannelUser = null;
        FullNameListInput fullNameListInput = null;
        ParsedNameListOutput response = api.parseList(xChannelSecret, xChannelUser, fullNameListInput);

        // TODO: test validations
    }
    
}
