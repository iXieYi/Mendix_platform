ALTER TABLE "myfirstmodule$drillingteam_bh" ADD CONSTRAINT "uniq_myfirstmodule$drillingteam_bh_myfirstmodule$bhid" UNIQUE ("myfirstmodule$bhid");
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$drillingteam_bh_myfirstmodule$bhid', 
'69af4902-086a-49fa-856f-5d59a9f1e448', 
'ed5b635d-e71a-32c3-8fbc-a660a5fb24a4');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210122 16:48:45';
