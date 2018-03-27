-- Put new feed schema on search_path
ALTER ROLE postgres SET search_path TO "$user",feed,public;
