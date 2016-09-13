public class Job {
 String mPosition;
 String mCompany;
 String mLocation;
 String mDescription;
 String mStart;
 String mEnd;

public Job(String position, String company, String location, String description, String start, String end) {
  mPosition = position;
  mCompany = company;
  mLocation = location;
  mDescription = description;
  mStart = start;
  mEnd = end;
}
public String getPosition() {
  return mPosition;
}
public String getCompany() {
  return mCompany;
}
public String getLocation() {
  return mLocation;
}
public String getDescription() {
  return mDescription;
}
public String getStart() {
  return mStart;
}
public String getEnd() {
  return mEnd;
}

}
