package com.dothings.training.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Date;

public final class JSONUtils {

	private static ThreadLocal<Gson> local = new ThreadLocal<Gson>();

	private static Gson getGson() {
		if (local.get() == null) {
			GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
				public Date deserialize(JsonElement p1, Type p2,JsonDeserializationContext p3) {
					return new Date(p1.getAsLong());
				}
			}).registerTypeAdapter(Date.class, new JsonSerializer<Date>(){
				public JsonElement serialize(Date arg0, Type arg1,JsonSerializationContext arg2) {
					return new JsonPrimitive(arg0.getTime());
				}
			});
			Gson gson = gsonBuilder.create();
			local.set(gson);
			return gson;
		} else {
			return local.get();
		}
	}

	public static <T> T fromJson(String json, Class<T> cls) {
		return getGson().fromJson(json, cls);
	}

	public static <T> T fromJson(String json,  Type typeOfT) {
		return getGson().fromJson(json, typeOfT);
	}

	public static String toJson(Object obj) {
		return getGson().toJson(obj);
	}

}