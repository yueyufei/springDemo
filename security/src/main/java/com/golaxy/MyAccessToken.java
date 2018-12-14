package com.golaxy;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;

public class MyAccessToken implements Serializable, OAuth2AccessToken{
	
	private boolean isDeadLine=false;

	private String value;

	private Date expiration;

	private String tokenType = "Oauth2";

	private OAuth2RefreshToken refreshToken;

	private Long creatTime;
//	private Set<String> scope;

	private Map<String, Object> additionalInformation = Collections.emptyMap();
	
	public MyAccessToken(String value) {
		this.value=value;
	}
	
	@SuppressWarnings("unused")
	private MyAccessToken() {
		this((String) null);
	}

	/**
	 * Copy constructor for access token.
	 * 
	 * @param accessToken
	 */
	public MyAccessToken(OAuth2AccessToken accessToken) {
		this(accessToken.getValue());
		setAdditionalInformation(accessToken.getAdditionalInformation());
		setRefreshToken(accessToken.getRefreshToken());
		setExpiration(accessToken.getExpiration());
		setTokenType(accessToken.getTokenType());
	}

	
	
	
	
	


	public boolean isDeadLine() {
		return isDeadLine;
	}

	public void setDeadLine(boolean isDeadLine) {
		this.isDeadLine = isDeadLine;
	}

	public Long getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Long creatTime) {
		this.creatTime = creatTime;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public void setRefreshToken(OAuth2RefreshToken refreshToken) {
		this.refreshToken = refreshToken;
	}

	public void setAdditionalInformation(Map<String, Object> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}








	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Map<String, Object> getAdditionalInformation() {
		return additionalInformation;
	}

	@Override
	public Date getExpiration() {
		return expiration;
	}

	@Override
	public int getExpiresIn() {
		return expiration != null ? Long.valueOf((expiration.getTime() - System.currentTimeMillis()) / 1000L)
				.intValue() : 0;
	}

	@Override
	public OAuth2RefreshToken getRefreshToken() {
		return refreshToken;
	}

	@Override
	public Set<String> getScope() {
		return null;
	}

	@Override
	public String getTokenType() {
		return tokenType;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public boolean isExpired() {
		return expiration != null && expiration.before(new Date());
	}
 
}
