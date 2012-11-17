package com.hascode.tutorial;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderTest {
	File parentFolder = new File("/tmp");

	@Rule
	public TemporaryFolder folder = new TemporaryFolder(parentFolder);

	@Test
	public void testUsingTempFolder() throws IOException {
		File newFile = folder.newFile("testfile.txt");
		File subDir = folder.newFolder("subfolder");
		File someFile = new File(subDir, "test.txt");
		someFile.createNewFile();
		assertTrue(someFile.exists());
		assertTrue(newFile.exists());
	}
}
