ALTER TABLE "myfirstmodule$project" ADD CONSTRAINT "uniq_myfirstmodule$project_number" UNIQUE ("number");
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$project_number', 
'bb5eeaa1-6c93-4391-b589-2316f9b2ab1a', 
'a594d397-698a-4ae2-ba60-1b5cf7d1cf2a');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210121 18:16:16';
