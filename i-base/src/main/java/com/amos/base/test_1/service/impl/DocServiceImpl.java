package com.amos.base.test_1.service.impl;

import com.amos.base.test_1.service.DocReadService;
import com.amos.base.test_1.service.DocWriteService;
import org.springframework.stereotype.Service;

/**
 * Doc Service
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/9/5
 */
@Service
public class DocServiceImpl implements DocReadService, DocWriteService {

	private String value;

	@Override
	public String query() {
		return this.value;
	}

	@Override
	public void save(String value) {
		this.value = value;
	}
}
