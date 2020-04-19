package com.amsidh.mvc.filter.chain;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.mvc.filter.Filter;
import com.amsidh.mvc.target.Target;

public class FilterChain {

	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}
}
