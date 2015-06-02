package id.ac.its.pbkk.pendidikan.domain.adapter;


import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.DateTime;
public class DateTimeAdapter extends XmlAdapter<String, DateTime> {
	@Override
	public DateTime unmarshal(String v) throws Exception {
		if (v == null || v.isEmpty()) {
			return null;
		}
		return new DateTime(v);
	}
	@Override
	public String marshal(DateTime v) throws Exception {
		if (v == null) {
			return null;
		}
		return v.toString();
	}
}