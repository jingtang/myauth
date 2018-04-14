package com.auth.myauth.vo;

import java.util.List;

import com.auth.myauth.entity.Resources;

public class ResourcesTree  extends  Resources{

	private List<ResourcesTree> child;

	public List<ResourcesTree> getChild() {
		return child;
	}

	public void setChild(List<ResourcesTree> child) {
		this.child = child;
	}
}
