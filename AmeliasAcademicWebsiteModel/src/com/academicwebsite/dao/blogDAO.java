/**
 * 
 */
package com.academicwebsite.dao;

import com.academicwebsite.model.Blog;
import com.academicwebsite.model.Comment;

/**
 * @author Liz
 *
 */
public interface blogDAO {
	
	public void addBlog(Blog blog);
	public void editBlog(int blogID);
	public void deleteBlog(int blogID);
	public void addComment(Comment comment);
	public void editComment(int commentID);
	public void deleteComment(int commentID);
	
}
