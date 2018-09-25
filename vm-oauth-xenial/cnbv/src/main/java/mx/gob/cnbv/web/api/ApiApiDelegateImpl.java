package mx.gob.cnbv.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import mx.gob.cnbv.web.api.model.Dato;

@Service
public class ApiApiDelegateImpl implements ApiApiDelegate {

	private final NativeWebRequest request;

	public ApiApiDelegateImpl(NativeWebRequest request) {
		this.request = request;
	}

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}
}
