package com.vs.model;

import com.vs.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

	private boolean isEnabled = false;
	private VerificationType sendTo;
}
