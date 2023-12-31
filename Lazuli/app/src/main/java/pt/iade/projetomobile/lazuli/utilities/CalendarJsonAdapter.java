package pt.iade.projetomobile.lazuli.utilities;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * JSON adapter for Calendar objects.
 *
 * @author Nathan Campos <nathan@innoveworkshop.com>
 */

public class CalendarJsonAdapter implements JsonSerializer<Calendar>, JsonDeserializer<Calendar> {
    @Override
    public JsonElement serialize(Calendar src, Type typeOfSrc, JsonSerializationContext context) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        return new JsonPrimitive(formatter.format(((GregorianCalendar)src).toZonedDateTime()));
    }

    @Override
    public Calendar deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(json.getAsString(), formatter);

        return new GregorianCalendar(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }
}