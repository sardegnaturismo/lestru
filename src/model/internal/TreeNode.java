/*******************************************************************************
 *
 *  Copyright 2011 - Sardegna Ricerche, Distretto ICT, Pula, Italy
 *
 * Licensed under the EUPL, Version 1.1.
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *  http://www.osor.eu/eupl
 *
 * Unless required by applicable law or agreed to in  writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 * In case of controversy the competent court is the Court of Cagliari (Italy).
 *******************************************************************************/
package model.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TreeNode {
	
	private TreeData data;
	private String state;
	private Map<String, String> attr;
	private List<TreeNode> children = new ArrayList<TreeNode>();
	
	
	public TreeData getData() {
		return data;
	}
	public void setData(TreeData data) {
		this.data = data;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<String, String> getAttr() {
		return attr;
	}
	public void setAttr(Map<String, String> attr) {
		this.attr = attr;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
	public Boolean addChild(TreeNode childNode) {
		return this.getChildren().add(childNode);
	}
	
	public static TreeNode buildNode(String title) {		//crea un nodo settandone il title
		TreeData data = new TreeData();
		data.setTitle(title);
		TreeNode newNode = new TreeNode();
		newNode.setData(data);
		return newNode;
	}
	
	public static TreeNode buildNode(String title, String href) {		//crea un nodo settandone il title e l'href
		TreeData data = new TreeData();
		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("href", href);
		data.setTitle(title);
		data.setAttr(dataMap);
		TreeNode newNode = new TreeNode();
		newNode.setData(data);	
		return newNode;
	}
	
	public Boolean buildChild(String childTitle) {	//aggiunge un nodo figlio settandone il title
		return this.addChild(TreeNode.buildNode(childTitle));
	}
	
	public Boolean buildChild(String childTitle, String href) {	//aggiunge un nodo figlio settandone il title e l'href
		return this.addChild(TreeNode.buildNode(childTitle, href));
	}
}
