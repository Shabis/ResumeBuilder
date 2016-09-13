import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("jobs", request.session().attribute("jobs"));
      model.put("template", "templates/index.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/jobs", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Job> jobs = request.session().attribute("jobs");
      if (jobs == null) {
        jobs = new ArrayList<Job>();
        request.session().attribute("jobs", jobs);
      }


      String position = request.queryParams("position");
      String company = request.queryParams("company");
      String location = request.queryParams("location");
      String description = request.queryParams("description");
      String start = request.queryParams("start");
      String end = request.queryParams("end");
      Job userJob = new Job (position, company, location, description, start, end);
      jobs.add(userJob);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
