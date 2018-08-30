package com.modal;

import java.util.Arrays;
import java.util.Date;

public class Node {

  private Date timestamp;
  private String data;
  private int nodeNumber;
  private String nodeId;
  private String referenceNodeId;
  private String[] childReferenceNodeId;
  private String genesisReferenceNodeId;
  private String hashValue;
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }
  public int getNodeNumber() {
    return nodeNumber;
  }
  public void setNodeNumber(int nodeNumber) {
    this.nodeNumber = nodeNumber;
  }
  public String getNodeId() {
    return nodeId;
  }
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }
  public String getReferenceNodeId() {
    return referenceNodeId;
  }
  public void setReferenceNodeId(String referenceNodeId) {
    this.referenceNodeId = referenceNodeId;
  }
  public String[] getChildReferenceNodeId() {
    return childReferenceNodeId;
  }
  public void setChildReferenceNodeId(String[] childReferenceNodeId) {
    this.childReferenceNodeId = childReferenceNodeId;
  }
  public String getGenesisReferenceNodeId() {
    return genesisReferenceNodeId;
  }
  public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
    this.genesisReferenceNodeId = genesisReferenceNodeId;
  }
  public String getHashValue() {
    return hashValue;
  }
  public void setHashValue(String hashValue) {
    this.hashValue = hashValue;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(childReferenceNodeId);
    result = prime * result + ((data == null) ? 0 : data.hashCode());
    result =
        prime * result + ((genesisReferenceNodeId == null) ? 0 : genesisReferenceNodeId.hashCode());
    result = prime * result + ((hashValue == null) ? 0 : hashValue.hashCode());
    result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
    result = prime * result + nodeNumber;
    result = prime * result + ((referenceNodeId == null) ? 0 : referenceNodeId.hashCode());
    result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Node other = (Node) obj;
    if (!Arrays.equals(childReferenceNodeId, other.childReferenceNodeId))
      return false;
    if (data == null) {
      if (other.data != null)
        return false;
    } else if (!data.equals(other.data))
      return false;
    if (genesisReferenceNodeId == null) {
      if (other.genesisReferenceNodeId != null)
        return false;
    } else if (!genesisReferenceNodeId.equals(other.genesisReferenceNodeId))
      return false;
    if (hashValue == null) {
      if (other.hashValue != null)
        return false;
    } else if (!hashValue.equals(other.hashValue))
      return false;
    if (nodeId == null) {
      if (other.nodeId != null)
        return false;
    } else if (!nodeId.equals(other.nodeId))
      return false;
    if (nodeNumber != other.nodeNumber)
      return false;
    if (referenceNodeId == null) {
      if (other.referenceNodeId != null)
        return false;
    } else if (!referenceNodeId.equals(other.referenceNodeId))
      return false;
    if (timestamp == null) {
      if (other.timestamp != null)
        return false;
    } else if (!timestamp.equals(other.timestamp))
      return false;
    return true;
  }
  
  public String calculateHash() {
    String calculatedhash =this.timestamp + this.data +
        this.nodeNumber + this.nodeId + this.referenceNodeId+
        this.childReferenceNodeId+ this.genesisReferenceNodeId;
    return calculatedhash;
}
  
  
}
