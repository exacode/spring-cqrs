package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgClassRelnameNspIndex is a Querydsl query type for QPgClassRelnameNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgClassRelnameNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgClassRelnameNspIndex> {

    private static final long serialVersionUID = 1149371982;

    public static final QPgClassRelnameNspIndex pgClassRelnameNspIndex = new QPgClassRelnameNspIndex("pg_class_relname_nsp_index");

    public final SimplePath<Object> relname = createSimple("relname", Object.class);

    public final NumberPath<Long> relnamespace = createNumber("relnamespace", Long.class);

    public QPgClassRelnameNspIndex(String variable) {
        super(QPgClassRelnameNspIndex.class, forVariable(variable), "pg_catalog", "pg_class_relname_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgClassRelnameNspIndex(Path<? extends QPgClassRelnameNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_class_relname_nsp_index");
    }

    public QPgClassRelnameNspIndex(PathMetadata<?> metadata) {
        super(QPgClassRelnameNspIndex.class, metadata, "pg_catalog", "pg_class_relname_nsp_index");
    }

}

