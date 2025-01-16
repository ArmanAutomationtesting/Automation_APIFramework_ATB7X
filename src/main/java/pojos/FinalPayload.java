package pojos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalPayload {

    public  static void main(String[]args) throws JsonProcessingException {

        IssueType issueType = new IssueType("Task");
        Projects projects = new Projects("REST");
        Payload payload = new Payload("Demo","DEMO1",issueType,projects);
        fields fields = new fields(payload);
        ObjectMapper objectMapper = new ObjectMapper();
      String issuepayload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
        System.out.println(issuepayload);

    }

}
