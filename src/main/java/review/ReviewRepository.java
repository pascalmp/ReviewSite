package review;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;


@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewById;

	public ReviewRepository() {

		reviewById = new HashMap<Long, Review>();
		Review review1 = new Review(1, "JavaScript", "Kierra",
				"MAjhhrhewowbddmdjbdejwejdbmsdm dsm dsm d sms dewmnejdmsm",
				new Date(2016, 10, 23));

		reviewById.put(review1.getId(), review1);

		Review review2 = new Review(2, "JQuery", "Matthew",
				"MAjhhrhewowbddmdjbdejwejdbmsdm dsm dsm d sms dewmnejdmsm",
				new Date(2016, 8, 20));

		reviewById.put(review2.getId(), review2);

		Review review3 = new Review(3, "JavaScript", "Seth",
				"MAjhhrhewowbddmdjbdejwejdbmsdm dsm dsm d sms dewmnejdmsm",
				new Date(2016, 10, 23));

		reviewById.put(review3.getId(), review3);

	}

	public Review findById(long id) {
		return reviewById.get(id);

	}

	public Collection<Review> findAll() {
		return reviewById.values();
	}
}
