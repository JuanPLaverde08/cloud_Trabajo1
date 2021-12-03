package co.com.poli.cloud_trabajo1.helper;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.IOException;

public class Deserializer extends StdDeserializer<Date> {
   private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
   public Deserializer() {
      this(null);
   }

   public Deserializer(Class<Date> t) {
      super(t);
   }

   @Override
   public Date deserialize(JsonParser parser, DeserializationContext context)
      throws IOException, JsonProcessingException {

      String date = parser.getText();
      try {
         return formatter.parse(date);
      }
      catch (ParseException e) {
         e.printStackTrace();
      }
      return null;
   }
}
