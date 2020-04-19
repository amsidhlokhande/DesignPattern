package com.amsidh.mvc.filter.chain;

import com.amsidh.mvc.filter.Filter;
import com.amsidh.mvc.target.Target;

public class FilterManager {

	FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
