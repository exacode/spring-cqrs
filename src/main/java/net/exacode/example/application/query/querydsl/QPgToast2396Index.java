package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2396Index is a Querydsl query type for QPgToast2396Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2396Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2396Index> {

    private static final long serialVersionUID = 1646941224;

    public static final QPgToast2396Index pgToast2396Index = new QPgToast2396Index("pg_toast_2396_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2396Index(String variable) {
        super(QPgToast2396Index.class, forVariable(variable), "pg_toast", "pg_toast_2396_index");
    }

    @SuppressWarnings("all")
    public QPgToast2396Index(Path<? extends QPgToast2396Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2396_index");
    }

    public QPgToast2396Index(PathMetadata<?> metadata) {
        super(QPgToast2396Index.class, metadata, "pg_toast", "pg_toast_2396_index");
    }

}

