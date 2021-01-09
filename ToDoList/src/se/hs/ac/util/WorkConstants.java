package se.hs.ac.util;

import java.time.format.DateTimeFormatter;

public class WorkConstants {

	public static final DateTimeFormatter YYYYMMDDHHMMSS = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static class Menu {
		public static final String ADD = "1";
		public static final String UPDATE = "2";
		public static final String REMOVE = "3";
		public static final String SHOW = "4";
		public static final String EXIT = "5";
	}
}
