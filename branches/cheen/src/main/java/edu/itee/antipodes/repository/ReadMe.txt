SQL changes:

-- removed "ON DELETE CASCADE" when create tables

Hibernate hbm changes:

-- changes from cascade="all" to cascade="save-update" on some files
-- remove cascade="all" on some files

Test cases:

-- remove set id
-- test add/drop to verify cascade


