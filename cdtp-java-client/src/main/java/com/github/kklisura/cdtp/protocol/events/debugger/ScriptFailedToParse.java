package com.github.kklisura.cdtp.protocol.events.debugger;

import com.github.kklisura.cdtp.protocol.annotations.Optional;
import com.github.kklisura.cdtp.protocol.types.runtime.StackTrace;
import com.github.kklisura.cdtp.protocol.annotations.Experimental;

/**
 * Fired when virtual machine fails to parse the script.
 */
public class ScriptFailedToParse {

	private String scriptId;

	private String url;

	private Integer startLine;

	private Integer startColumn;

	private Integer endLine;

	private Integer endColumn;

	private Integer executionContextId;

	private String hash;

	@Optional
	private Object executionContextAuxData;

	@Optional
	private String sourceMapURL;

	@Optional
	private Boolean hasSourceURL;

	@Optional
	private Boolean isModule;

	@Optional
	private Integer length;

	@Experimental
	@Optional
	private StackTrace stackTrace;

	/**
	 * Identifier of the script parsed.
	 */
	public String getScriptId() {
		return scriptId;
	}

	/**
	 * Identifier of the script parsed.
	 */
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	/**
	 * URL or name of the script parsed (if any).
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * URL or name of the script parsed (if any).
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Line offset of the script within the resource with given URL (for script tags).
	 */
	public Integer getStartLine() {
		return startLine;
	}

	/**
	 * Line offset of the script within the resource with given URL (for script tags).
	 */
	public void setStartLine(Integer startLine) {
		this.startLine = startLine;
	}

	/**
	 * Column offset of the script within the resource with given URL.
	 */
	public Integer getStartColumn() {
		return startColumn;
	}

	/**
	 * Column offset of the script within the resource with given URL.
	 */
	public void setStartColumn(Integer startColumn) {
		this.startColumn = startColumn;
	}

	/**
	 * Last line of the script.
	 */
	public Integer getEndLine() {
		return endLine;
	}

	/**
	 * Last line of the script.
	 */
	public void setEndLine(Integer endLine) {
		this.endLine = endLine;
	}

	/**
	 * Length of the last line of the script.
	 */
	public Integer getEndColumn() {
		return endColumn;
	}

	/**
	 * Length of the last line of the script.
	 */
	public void setEndColumn(Integer endColumn) {
		this.endColumn = endColumn;
	}

	/**
	 * Specifies script creation context.
	 */
	public Integer getExecutionContextId() {
		return executionContextId;
	}

	/**
	 * Specifies script creation context.
	 */
	public void setExecutionContextId(Integer executionContextId) {
		this.executionContextId = executionContextId;
	}

	/**
	 * Content hash of the script.
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * Content hash of the script.
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * Embedder-specific auxiliary data.
	 */
	public Object getExecutionContextAuxData() {
		return executionContextAuxData;
	}

	/**
	 * Embedder-specific auxiliary data.
	 */
	public void setExecutionContextAuxData(Object executionContextAuxData) {
		this.executionContextAuxData = executionContextAuxData;
	}

	/**
	 * URL of source map associated with script (if any).
	 */
	public String getSourceMapURL() {
		return sourceMapURL;
	}

	/**
	 * URL of source map associated with script (if any).
	 */
	public void setSourceMapURL(String sourceMapURL) {
		this.sourceMapURL = sourceMapURL;
	}

	/**
	 * True, if this script has sourceURL.
	 */
	public Boolean getHasSourceURL() {
		return hasSourceURL;
	}

	/**
	 * True, if this script has sourceURL.
	 */
	public void setHasSourceURL(Boolean hasSourceURL) {
		this.hasSourceURL = hasSourceURL;
	}

	/**
	 * True, if this script is ES6 module.
	 */
	public Boolean getIsModule() {
		return isModule;
	}

	/**
	 * True, if this script is ES6 module.
	 */
	public void setIsModule(Boolean isModule) {
		this.isModule = isModule;
	}

	/**
	 * This script length.
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * This script length.
	 */
	public void setLength(Integer length) {
		this.length = length;
	}

	/**
	 * JavaScript top stack frame of where the script parsed event was triggered if available.
	 */
	public StackTrace getStackTrace() {
		return stackTrace;
	}

	/**
	 * JavaScript top stack frame of where the script parsed event was triggered if available.
	 */
	public void setStackTrace(StackTrace stackTrace) {
		this.stackTrace = stackTrace;
	}
}